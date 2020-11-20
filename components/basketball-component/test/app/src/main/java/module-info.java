open module be.veraghtert.tutorial.maven.dependency.mediation.basketball.test.app {
    exports be.veraghtert.tutorial.maven.dependency.mediation.basketball.test.app;

    requires be.veraghtert.tutorial.maven.dependency.mediation.basketball.component;

    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.beans;
}