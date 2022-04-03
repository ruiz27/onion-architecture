package com.exercise.onion;

import org.junit.jupiter.api.Test;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

public class ArchitectureTest {

    //Class to be inspected
    private static final JavaClasses CLASSES =
            new ClassFileImporter()
                    .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
                    .importPackages("com.exercise.onion");

    @Test
    void givenProjectWhenValidateOnionThenOK() {
        onionArchitecture()
        // domain.Define model package as domain model layer
        .domainModels("com.exercise.onion.domain.model..")
        // domain.Define service package as domain service layer
        .domainServices("com.exercise.onion.domain.service..")
        //Define application package as application service layer
        .applicationServices("com.exercise.onion.application..")
        //Define infrastructure package as infrastructure adapter
        .adapter("infra", "com.exercise.onion.infrastructure..")
        //Define presentation package as user interface adapter
        //.adapter("ui", "com.exercise.onion.presentation..")

        .check(CLASSES);
    }
}
