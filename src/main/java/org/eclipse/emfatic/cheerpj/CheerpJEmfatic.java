package org.eclipse.emfatic.cheerpj;

import java.io.ByteArrayInputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.emfatic.core.EmfaticResource;

public class CheerpJEmfatic {

    public static void main(String[] args) throws Exception {
        System.out.println(new CheerpJEmfatic().getRootPackageName("package p;"));
    }

    public String getRootPackageName(String emfatic) throws Exception {
        EmfaticResource emfaticResource = new EmfaticResource(URI.createURI("emfatic.emf"));
        emfaticResource.load(new ByteArrayInputStream(emfatic.getBytes()), null);
        EPackage ePackage = (EPackage) emfaticResource.getContents().get(0);
        return ePackage.getName();
    }

}
