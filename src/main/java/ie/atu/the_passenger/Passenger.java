package ie.atu.the_passenger;

public class Passenger {
    private String Title;
    private String Name;
    private String Id;
    private int Phone_no;
    private int Age;

    public Passenger(String title, String name, String id, int phone_no, int age) {
        set_title(title);
        set_name(name);
        set_id(id);
        set_no(phone_no);
        set_age(age);

    }

    private void set_age(int age) {
        Age = age;
    }

    private void set_no(int phone_no) {
        Phone_no = phone_no;
    }

    private void set_id(String id) {
        Id = id;
    }

    private void set_name(String name) {
        Name = name;
    }

    public void set_title(String title)
    {
        if ("Mr".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title))
        {

        }
        else
        {
            ///throw exception!!!


        }

    }

    public String get_title() {
        return Title;
    }
}
