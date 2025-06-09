@SuppressWarnings("All")
public class Character {
    private String name;
    private String gender; 
    private String eyeColour;
    private String skinTone;
    private String hairColour;
    private boolean facialHair;
    private boolean glasses; 
    private boolean teethVisibility; 
    private boolean wearingHat;
    private String hairLength;
    private boolean piercings;    
    public Character (String name, String gender, String eyeColour, String skinTone, String hairColour, boolean facialHair, boolean glasses, boolean teethVisibility, boolean wearingHat, String hairLength, boolean piercings) {
        this.name = name;
        this.gender = gender;
        this.eyeColour = eyeColour;
        this.skinTone = skinTone; 
        this.hairColour = hairColour;
        this.facialHair = facialHair;
        this.glasses = glasses;
        this.teethVisibility = teethVisibility;
        this.wearingHat = wearingHat;
        this.hairLength = hairLength;
        this.piercings = piercings;
    }    public static void main(String[] args) {

    /* -------------  MALES  ------------- */
    Character Sam    = new Character("Sam",    "Male",   "Green", "Dark",  "Black",  false, false, false, true,  "Short",  false);
    Character Nick   = new Character("Nick",   "Male",   "Brown", "Light", "Blonde", false, false, false, false, "Short",  true );
    Character David  = new Character("David",  "Male",   "Brown", "Light", "Blonde", true,  false, true,  true,  "Short",  false);
    Character Leo    = new Character("Leo",    "Male",   "Brown", "Dark",  "White",  true,  false, true,  false, "Short",  false);
    Character Daniel = new Character("Daniel", "Male",   "Green", "Light", "Ginger", true,  false, false, false, "Tied",   false);
    Character Ben    = new Character("Ben",    "Male",   "Brown", "Light", "Brown",  false, true,  false, false, "Short",  true );
    Character Al     = new Character("Al",     "Male",   "Green", "Dark",  "White",  true,  true,  false, false, "Bald",   false);
    Character Mike   = new Character("Mike",   "Male",   "Brown", "Light", "Black",  false, false, true,  true,  "Short",  false);
    Character Gabe   = new Character("Gabe",   "Male",   "Brown", "Dark",  "Black",  false, false, false, false, "Short",  false);
    Character Jordan = new Character("Jordan", "Male",   "Brown", "Dark",  "Black",  true,  false, false, false, "Short",  true );
    Character Eric   = new Character("Eric",   "Male",   "Blue",  "Light", "Black",  false, false, false, false, "Short",  false);
    Character Joe    = new Character("Joe",    "Male",   "Brown", "Dark",  "White",  true,  true,  true,  false, "Bald",   false);

    /* -------------  FEMALES ------------- */
    Character Olivia = new Character("Olivia", "Female", "Brown", "Dark",  "Black",  false, false, false, false, "Tied",   false);
    Character Sofia  = new Character("Sofia",  "Female", "Green", "Dark",  "Brown",  false, false, true,  false, "Short",  true );
    Character Liz    = new Character("Liz",    "Female", "Blue",  "Light", "White",  false, true,  true,  false, "Long",   false);
    Character Lily   = new Character("Lily",   "Female", "Green", "Dark",  "Brown",  false, false, true,  true,  "Long",   false);
    Character Emma   = new Character("Emma",   "Female", "Brown", "Light", "Ginger", false, false, false, false, "Tied",   false);
    Character Katie  = new Character("Katie",  "Female", "Blue",  "Light", "Blonde", false, false, false, true,  "Tied",   false);
    Character Amy    = new Character("Amy",    "Female", "Brown", "Light", "Black",  false, true,  false, false, "Short",  false);
    Character Farah  = new Character("Farah",  "Female", "Blue",  "Dark",  "Black",  false, false, false, false, "Tied",   false);
    Character Laura  = new Character("Laura",  "Female", "Green", "Dark",  "Black",  false, false, true,  false, "Long",   true );
    Character Carmen = new Character("Carmen", "Female", "Brown", "Dark",  "White",  false, false, true,  false, "Short",  true );
    Character Rachel = new Character("Rachel", "Female", "Blue",  "Light", "Brown",  false, true,  false, false, "Long",   true );
    Character Mia    = new Character("Mia",    "Female", "Brown", "Dark",  "Black",  false, false, true,  false, "Long",   false);

    }   
}
