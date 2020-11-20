open module be.veraghtert.tutorial.maven.dependency.mediation.sports.app {
    requires be.veraghtert.tutorial.maven.dependency.mediation.basketball.component;
    requires be.veraghtert.tutorial.maven.dependency.mediation.tennis.component;

    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.boot;
    requires spring.beans;
}