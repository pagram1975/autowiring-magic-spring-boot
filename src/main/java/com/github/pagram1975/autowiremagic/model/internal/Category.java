package com.github.pagram1975.autowiremagic.model.internal;

public enum Category {
    RESOURCES,
    CLOUD,
    TECH,
    UX_DESIGN {
        String externalName = "UX Design";

        public String toExternalForm() {
            return externalName;
        }
    },
    DELIVERY,
    TESTING,
    DATA_ENGINEERING {
        String externalName = "Data Engineering";

        public String toExternalForm() {
            return externalName;
        }
    },
    CAREERS,
    DIVERSITY;

    public String toExternalForm() {
        return name().substring(0,1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
