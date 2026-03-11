import java.util.*;

public class InstrumentSpec {

    private Map<String, Object> properties;

    /* ---------------- ENUMS ---------------- */

    public enum InstrumentType {
        GUITAR,
        MANDOLIN,
        BANJO,
        DOBRO,
        FIDDLE
    }

    public enum Wood {
        SPRUCE,
        SITKA_SPRUCE,
        ADIRONDACK_SPRUCE,
        SOLID_SPRUCE,
        CARVED_SPRUCE,

        MAPLE,
        FLAMED_MAPLE,
        CURLY_MAPLE,
        TIGER_MAPLE,
        FLAME_MAPLE,

        MAHOGANY,
        ROSEWOOD,
        NATO,
        LINDEN,
        ALDER,
        ASH,
        SWAMP_ASH,
        BASSWOOD,
        CEDAR,
        BIRCH,
        LYRACHORD
    }

    public enum Style {
        A,
        F
    }

    public enum Manufacturer {

        FENDER,
        GIBSON,
        TAYLOR,
        MARTIN,
        IBANEZ,
        EASTMAN,
        COLLINGS,
        GODIN,
        OVATION,
        TRAVIS_BEAN,
        GOLD_TONE,
        LOAR,
        LOMBARDI,
        FAIRBANKS,
        STUART,

        EPIPHONE,
        YAMAHA,
        PRS,
        ESP,
        GRETSCH,
        SCHECTER,
        DUNABLE,
        MUSIC_MAN,
        GUILD,
        LARRIVEE,
        SEAGULL,

        DEERING,
        SAGA,
        WASHBURN,
        OSCAR_SCHMIDT,
        RECORDING_KING,
        STELLING,
        PRESTON,
        SUZUKI,
        JOHN_L_BERNUN,
        BEAR_CREEK,

        DOBRO,
        BREEDLOVE,
        JOHNSON,
        NATIONAL,
        DOLCE,
        AFFORDABLE,

        CREMONA,
        STENTOR,
        FIDDLERMAN,
        MENDINI,
        KNILLING,
        PASCOLINI,
        CECILIO,
        NORMAN,
        ALVAREZ,
        LUBY
    }

    /* ---------------- CONSTRUCTOR ---------------- */

    public InstrumentSpec(Map<String, Object> properties) {
        this.properties = new HashMap<>(properties);
    }

    /* ---------------- GETTERS ---------------- */

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    /* ---------------- MATCH FUNCTION ---------------- */

    public boolean matches(InstrumentSpec otherSpec) {

        for (String propertyName : otherSpec.getProperties().keySet()) {

            Object value = otherSpec.getProperty(propertyName);

            if (value != null) {

                Object thisValue = properties.get(propertyName);

                if (thisValue == null || !thisValue.equals(value)) {
                    return false;
                }
            }
        }

        return true;
    }
}