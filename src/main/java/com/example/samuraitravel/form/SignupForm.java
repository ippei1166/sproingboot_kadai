package com.example.samuraitravel.form;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class SignupForm {
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
     @Email(message = "メールアドレスは正しい形式で入力してください。")
     private String email;
     
     @NotBlank(message = "パスワードを入力してください。")
     @Length(min = 8, message = "パスワードは8文字以上で入力してください。")
     private String password;    
     
     @NotBlank(message = "パスワード（確認用）を入力してください。")
     private String passwordConfirmation;

	public String getEmail() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getPasswordConfirmation() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getPostalCode() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getFurigana() {
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
}
