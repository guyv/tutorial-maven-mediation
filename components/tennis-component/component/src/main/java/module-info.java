open module be.veraghtert.tutorial.maven.dependency.mediation.tennis.component {
    exports be.veraghtert.tutorial.maven.dependency.mediation.tennis.component;

    requires be.veraghtert.tutorial.maven.dependency.mediation.tennis.manualtestsupport;
    requires be.veraghtert.tutorial.maven.dependency.mediation.tennis.domain;

    requires spring.boot.autoconfigure;
    requires spring.context;
    requires com.fasterxml.classmate;
    requires com.fasterxml.jackson.databind;
}