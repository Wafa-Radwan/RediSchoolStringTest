public class Human {
    String name;
    String occupation;

    public Human(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public String changeName(String oldName)
    {
        String tempName="";
        if(oldName.contains("a"))
        {
         tempName= oldName.replace('a','e');
        }
        return tempName;
    }

    public String toString()
    {
        return String.format("the name is %s, and the occupation is %s. ",changeName(name),occupation);
    }
}
