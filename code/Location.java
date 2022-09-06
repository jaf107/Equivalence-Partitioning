package code;

public class Location {
    private String countryName;
    private String districtName;

    public Location(String countryName, String districtName) {
        this.countryName = countryName;
        this.districtName = districtName;
    }

    boolean validCountry(){
        if(countryName.toLowerCase() == "bangladesh"){
            return true;
        }
        return false;
    }

    boolean validDistrict(){
        if(districtName.toLowerCase() == "dhaka"
                || districtName.toLowerCase() == "chittagong"
                || districtName.toLowerCase() == "chattogram"
                || districtName.toLowerCase() == "rajshahi"
                || districtName.toLowerCase() == "khulna"
                || districtName.toLowerCase() == "rangpur"
                || districtName.toLowerCase() == "sylhet"
                || districtName.toLowerCase() == "barisal"
                || districtName.toLowerCase() == "barishal"
                || districtName.toLowerCase() == "mymensingh"){
            return true;
        }
        return false;
    }

    boolean validLocation(){
        if(validCountry() && validDistrict())
            return true;
        return false;
    }

    public String getLocationString(){
        String result = "";
        if(validLocation())
            result =  districtName+", " + countryName;
        else
            result = "Invalid Location";
        return result;
    }
}
