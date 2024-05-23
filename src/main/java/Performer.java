import java.util.Date;

public class Performer {
    private String name;
    private Date dateOfBirth;

    private Date dateOfFirstMovie;

    public Performer(String n, Date date, Date firstMov){
        this.name=n;
        this.dateOfBirth=date;
        this.dateOfFirstMovie=firstMov;
    }

    public String getName() {
        return this.name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     *
     * @param dateOfBirth
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfFirstMovie() {
        return dateOfFirstMovie;
    }

    public void setDateOfFirstMovie(Date dateOfFirstMovie) {
        this.dateOfFirstMovie = dateOfFirstMovie;
    }
}
