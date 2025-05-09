package v3_builder;

public class PachetCalatorie {
    private final boolean hasWiFi;
    private final boolean hasAnimale;
    private final boolean isFumator;
    private final boolean hasAC;
    private final boolean hasTV;

    private PachetCalatorie(PachetCalatorieBuilder builder) {
        this.hasWiFi = builder.hasWiFi;
        this.hasAnimale = builder.hasAnimale;
        this.isFumator = builder.isFumator;
        this.hasAC = builder.hasAC;
        this.hasTV = builder.hasTV;
    }
    public static PachetCalatorieBuilder builder() {
        return new PachetCalatorieBuilder();
    }

    public static class PachetCalatorieBuilder implements Builder{
        private boolean hasWiFi;
        private boolean hasAnimale;
        private boolean isFumator;
        private boolean hasAC;
        private boolean hasTV;


        public PachetCalatorieBuilder setHasWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public PachetCalatorieBuilder setHasAnimale(boolean hasAnimale) {
            this.hasAnimale = hasAnimale;
            return this;
        }

        public PachetCalatorieBuilder setFumator(boolean fumator) {
            isFumator = fumator;
            return this;
        }

        public PachetCalatorieBuilder setHasAC(boolean hasAC) {
            this.hasAC = hasAC;
            return this;
        }

        public PachetCalatorieBuilder setHasTV(boolean hasTV) {
            this.hasTV = hasTV;
            return this;
        }


        @Override
        public PachetCalatorie build() {
            return new PachetCalatorie(this);
        }
    }

    @Override
    public String toString() {
        return "PachetCalatorie{" +
                "hasWiFi=" + hasWiFi +
                ", hasAnimale=" + hasAnimale +
                ", isFumator=" + isFumator +
                ", hasAC=" + hasAC +
                ", hasTV=" + hasTV +
                '}';
    }


}
