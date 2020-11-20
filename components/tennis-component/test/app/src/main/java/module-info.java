open module be.veraghtert.tutorial.maven.dependency.mediation.tennis.test.app {
    exports be.veraghtert.tutorial.maven.dependency.mediation.tennis.test.app;

    requires be.veraghtert.tutorial.maven.dependency.mediation.tennis.component;

    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.beans;
}