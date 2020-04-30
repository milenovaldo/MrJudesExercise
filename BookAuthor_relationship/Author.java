

public class Author {
    private
        String name;
        String email;
        char gender;

    public Author(String name_input, String email_input, char gender_input) {
        this.name = name_input;
        this.email = email_input;
        if (java.lang.Character.toLowerCase(gender_input) == 'm' || java.lang.Character.toLowerCase(gender_input) == 'f'){
            this.gender = java.lang.Character.toLowerCase(gender_input);
        }
        else{
            System.out.println("Invalid gender.");
        }
    }

    public String getName() {
        return name;
    }
    /**
     * @return the email 
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author [name=" + getName() + ",email=" + getEmail() + ",gender=" + getGender() + "]";
    }


}