package icehs.science.chapter07;

public class Publication {

	private String title;
	private int price;
	private int page;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(int price) {
		if (price < 0) {
			System.out.println("[에러] 가격 정보는 음수를 입력할 수 없습니다!");
		}else {
			this.price = price;
		}

	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPage(int page) {
		if (page < 0) {
			System.out.println("[에러] 페이지 정보는 음수를 입력할 수 없습니다!");
		}else {
			this.page = page;
		}

	}
	
	public int getPage() {
		return page;
	}
	
	public static void printHeader() {
		System.out.println("=====도서 정보 조회=====");
	}
	
	
}
