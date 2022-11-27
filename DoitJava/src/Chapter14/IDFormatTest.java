package Chapter14;

import javax.swing.table.TableRowSorter;

public class IDFormatTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if (userID == null) {
            throw new IDFormatException("아이디는 NULL일 수 없습니다.");
        }
        else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
        }
        this.userID = userID;
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();
        String userId = null;

        try {
            test.setUserID(userId);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userId = "123456";
        try{
            test.setUserID(userId);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
