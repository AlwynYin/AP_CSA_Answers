package APCS_2010;

import APCS_2017.Phrase;

import java.util.ArrayList;

public class MasterOrder {
    private ArrayList<CookieOrder> orders;

    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    public int getTotalBoxes() {
        int count = 0;
        for (CookieOrder order: orders) {
            count += order.getNumBoxes();
        }
        return count;
    }

    public int removeVariety(String cookieVar) {
        int removeCount = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getVariety().equals(cookieVar)) {
                orders.remove(i);
                i--;
                removeCount++;
            }
        }
        return removeCount;
    }

    public String toString() {
        String str = "";
        for (CookieOrder each: orders)
            str += each.getVariety() + " " + each.getNumBoxes() + ", ";
        return str;
    }
}
