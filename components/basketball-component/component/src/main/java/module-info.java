open module be.veraghtert.tutorial.maven.dependency.mediation.basketball.component {
    exports be.veraghtert.tutorial.maven.dependency.mediation.basketball.component;

    requires be.veraghtert.tutorial.maven.dependency.mediation.basketball.manualtestsupport;
    requires be.veraghtert.tutorial.maven.dependency.mediation.basketball.domain;

    requires spring.boot.autoconfigure;
    requires spring.context;
    requires com.fasterxml.classmate;
    requires com.fasterxml.jackson.databind;
}