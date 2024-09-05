import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyHomeworkTests {

    /*
    В случае отказа от посещения мероприятия по причинам, не связанным с отменой/переносом мероприятия, посетитель имеет право при возврате билета:
    1) более 10 дней - получить обратно полную стоимость билетов;
    2) от 6 до 10 дней включительно - получить только 50% стоимости билетов;
    3) от 3 до 6 дней включительно - получить 30% стоимости билетов;
    4) 72 часа и менее до начала концерта - стоимость билетов не возвращается.
     */
    @Test
    public void testGetRefundTicketPricePercent_Returns100() {
        int result = this.getRefundTicketPricePercent(10, true, true);
        assertEquals(100, result);
    }

    @Test
    public void testGetRefundTicketPricePercent_Over240Hour_Returns100() {
        int result = this.getRefundTicketPricePercent(300, false, false);
        assertEquals(100, result);
    }

    @Test
    public void testGetRefundTicketPricePercent_Returns50() {
        int result = this.getRefundTicketPricePercent(200, false, false);
        assertEquals(50, result);
    }

    @Test
    public void testGetRefundTicketPricePercent_Returns30() {
        int result = this.getRefundTicketPricePercent(50, false, false);
        assertEquals(30, result);
    }

    @Test
    public void testGetRefundTicketPricePercent_Returns0() {
        int result = this.getRefundTicketPricePercent(2, false, false);
        assertEquals(0, result);
    }

    private Integer getRefundTicketPricePercent(Integer hoursBeforeConcert, Boolean wasConcertCancelled, Boolean wasConcertRescheduled)
    {
        if(wasConcertCancelled && wasConcertRescheduled) return 100;
        if(hoursBeforeConcert > 240) return 100;
        if(hoursBeforeConcert >= 144 && hoursBeforeConcert <= 240) return 50;
        if(hoursBeforeConcert > 3 && hoursBeforeConcert <= 144) return 30;
        return 0;
    }

}
