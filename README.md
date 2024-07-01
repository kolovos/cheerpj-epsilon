# CheerpJ Emfatic Demonstration

Example demonstrating an exception happening while running [Emfatic](https://eclipse.dev/emfatic) in the browser through [CheerpJ](https://labs.leaningtech.com/cheerpj3).

## Instructions

- In the root folder run `mvn package`. This will produce `target/emfatic.jar`
- In the root folder run a local web-server using `npx http-server`
- Visit http://localhost:8080/ in your browser
- Wait for a few seconds and `Error: null` will appear on the page instead of the expected `p`. This is due to an `java.lang.ExceptionInInitializerError` that happens when executing `CheerpJEmfatic.getRootPackageName()` from CheerpJ. Executing the same method through Java doesn't throw this exception.
