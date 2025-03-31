public class SpecialtyCoffee extends Coffee
{
    private String flavor;


    public SpecialtyCoffee(String isize, boolean iisSkinny, int ishots, String itype, String iflavor)
    {
        super(isize, iisSkinny, ishots, itype);
        flavor = iflavor;
    }

    public SpecialtyCoffee()
    {
        super("small", false, 1, "latte");
        flavor = "vanilla";
    }

    public SpecialtyCoffee(String isize, String itype, String ifalvor)
    {
        super(isize, false, 1, itype);
        flavor = iflavor;
    }
}