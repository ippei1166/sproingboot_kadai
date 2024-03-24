package com.example.samuraitravel.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class UserEditForm {
	 public UserEditForm(Integer id2, String name2, String furigana2, String postalCode2, String address2,
			String phoneNumber2, String email2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@NotNull
     private Integer id;
     
     @NotBlank(message = "氏名を入力してください。")
     private String name;
     
     @NotBlank(message = "フリガナを入力してください。")
     private String furigana;
     
     @NotBlank(message = "郵便番号を入力してください。")
     private String postalCode;
     
     @NotBlank(message = "住所を入力してください。")
     private String address;
     
     @NotBlank(message = "電話番号を入力してください。")
     private String phoneNumber;
     
     @NotBlank(message = "メールアドレスを入力してください。")
     private String email;

	public Integer getId() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getFurigana() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getPostalCode() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getAddress() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getPhoneNumber() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getEmail() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
