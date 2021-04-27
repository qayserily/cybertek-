package Assignment_8;

public class Question_16 {
    public static void main(String[] args) {
        System.out.println(simpleRoomBook(false,2,1,2018));
        System.out.println(simpleRoomBook(true,2,1,2018));
        System.out.println(simpleRoomBook(true,7,2,2018));

    }

    public static boolean simpleRoomBook(boolean isAvailible, int month, int day, int year) {
        boolean date = true;
        if (year != 2018) {
            date = false;
        } else if (month == 7) {
            if (day <= 8 && day >=1) {
                date = false;
            }

        }

        return (isAvailible && date);
    }
    }


/* To book a room first it needs to be available for rent and make sure its available at the date selected:
the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting bookings only for year of 2018
example:
simpleRoomBook(false,2,1,2018)
return false
simpleRoomBook(true,2,1,2018)
return true
simpleRoomBook(true,7,2,2018)
return false */
