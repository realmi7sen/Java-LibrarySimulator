//Abdulmohsin Alamri    ID:446106954




package LibrarySystem;



public class Member {
//User's features
	private int id;
	private String name;
	private int BorrowCount;
	
	
	
	
//What get's calculated after user's actions
	private int nViewBorrow;
	private int nBorrow;
	private int nReturns;
	private double SessionFee;
	
//Public variables by all users
	public static double TotalRevenue = 0.0;
	public static int TotalVBorrowed = 0;
	public static int TotalBorrows = 0;
	public static int TotalReturn = 0;
	
//Creating users
	public Member(int id,String name, int BorrowCount) {
		
		this.id = id;
		this.name = name;
		this.BorrowCount = BorrowCount;
		
		this.nViewBorrow = 0;
		this.nBorrow = 0;
		this.nReturns = 0;
		this.SessionFee = 0;
//ID
	}
	public int GetID () {
		return id;
	}
//Name
	public String GetName() {
		
		return name;
	}
	
//Number of borrows
	private boolean Canborrow() {
		return BorrowCount < 5;
	}

//Numebr of returns
	private boolean CanReturn() {
		return BorrowCount > 0;
	}

//How many the user have books
	public void nViewBorrowCounts() {
		
		System.out.println("You have borrowed so far " + BorrowCount + "book");
		nViewBorrow++;
		TotalVBorrowed++;
		
	}

//User Returns One books
	public boolean ReturnOne() {
        if (!CanReturn()) {
            System.out.println("You can't return");
            return false;
        }

        BorrowCount--;
        nReturns++;
        TotalReturn++;

        System.out.println("Book returned");
        System.out.println("You have now " + BorrowCount + "book(s)");
        return true;
    }
//User Borrow One book
	public boolean borrowOne() {
	    if (!Canborrow()) {
	        System.out.println("Max borrowed books (5) have been reached");
	        return false;
	    }

	    BorrowCount++;
	    nBorrow++;
	    SessionFee += 0.5;

	    TotalBorrows++;
	    TotalRevenue += 0.5;

	    System.out.println("Book borrowed");
	    System.out.println("You have borrowed " + BorrowCount+ " book(s)");
	    return true;
	}

//Show the Borrows and Retruns STATS
    public void displayStatistics() {
        System.out.println("Borrowed this session: " + nBorrow);
        System.out.println("Returned this session: " + nReturns);
        System.out.println("Session fee: " + SessionFee);
    }
//When user exists the STATS get's rest
    public void reset() {
        nViewBorrow = 0;
        nBorrow = 0;
        nReturns = 0;
        SessionFee = 0.0;
    }
}







