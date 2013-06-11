public class CompleteEventSite {
    private int siteNumber;
    private double hourlyRate;
    private String siteName;

    public CompleteEventSite(){

        siteNumber = 999;
        hourlyRate = 7.50;
        siteName = "Kwame Nkrumah Room";
    }

    public int getSiteNumber(){

        return siteNumber;
    }

    public void setSiteNumber(int n){

        siteNumber = n;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public void setHourlyRate(double rate){

        hourlyRate = rate;
    }

    public String getSiteName(){

        return siteName;
    }

    public void setSiteName(String name){

        siteName = name;
    }
}
