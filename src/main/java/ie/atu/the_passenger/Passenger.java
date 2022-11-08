package ie.atu.the_passenger;

public class Passenger {
    private String Title;
    private String Name;
    private long Id;
    private long Phone_no;
    private int Age;

    public Passenger(String title, String name, long id, long phone_no, int age) {
        set_title(title);
        set_name(name);
        set_id(id);
        set_no(phone_no);
        set_age(age);
    }

    private void set_age(int age) {
        //Passenger must be 16 years or older
        if(age>16)
        {
            Age = age;
        }
        else
        {
            throw new IllegalArgumentException("Passenger must be over 16 to fly");
        }
    }

    private void set_no(long phone_no)
    {
        //phone number must be at least 7 digits long
        if(String.valueOf(phone_no).length() >= 7)
        {
            Phone_no = phone_no;
        }
        else
        {
            throw new IllegalArgumentException("Phone number must be at least 7 digits long");
        }
    }

    private void set_id(long id) {
        //Passenger id must be atleast 10 digits long
        if (String.valueOf(id).length()>=10)
        {
            Id = id;
        }
        else
        {
            throw new IllegalArgumentException("Id must be at least 10 digits long");
        }
    }

    private void set_name(String name) {
        //Passenger name must be at least 3 characters
        if (name.length()>=3)
        {
            Name = name;
        }
        else
        {
            throw new IllegalArgumentException("Name must be longer than 3 characters");
        }

    }

    public void set_title(String title)
    {
        //Passenger title can only be Mr, Ms or Mrs
        if ("Mr".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title))
        {
            Title = title;
        }
        else
        {
            throw new IllegalArgumentException("Title can only be Mr, Mrs or Ms");
        }

    }

    public String get_title() {
        return Title;
    }

    public String get_name() {
        return Name;
    }

    public long get_id() {
        return Id;
    }

    public long get_phone_no() {
        return Phone_no;
    }

    public int get_age() {
        return Age;
    }
}
