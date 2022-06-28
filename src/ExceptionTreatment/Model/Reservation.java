package ExceptionTreatment.Model;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date chekIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date chekIn, Date checkOut) throws AppExceptions {
        if (!checkOut.after(chekIn)) {
            throw new AppExceptions("Check-out date must be after check-in date ");
        }
        this.roomNumber = roomNumber;
        this.chekIn = chekIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getChekIn() {
        return chekIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - chekIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date chekIn, Date checkOut) throws AppExceptions {
        Date now = new Date();
        if (chekIn.before(now) || checkOut.before(now)) {
            throw new AppExceptions("Reservation date for update must be future dates ");
        }
        if (!checkOut.after(chekIn)) {
            throw new AppExceptions("Check-out date must be after check-in date ");
        }
        this.chekIn = chekIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + ", check-in: " + sdf.format(chekIn) + sdf.format(checkOut) + " , " + duration() + " nights";
    }
}
