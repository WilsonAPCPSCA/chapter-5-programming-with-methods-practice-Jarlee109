import java.util.Scanner;
public class timeEnglish {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the hour section of the time: ");
		int hours = in.nextInt();
		System.out.println("Enter the minutes section of the time: ");
		int minutes = in.nextInt();
		String timeName = getTimeName(hours, minutes);
		System.out.println(timeName);

	}
	public static String getTimeName(int hours, int minutes){
		String hour = null;
		String time = null;
		if (hours == 1){
			hour = "one";
		}else if(hours ==2){
			hour = "two";
		}else if(hours == 3){
			hour = "three";
		}else if(hours == 4){
			hour = "four";
		}else if(hours == 5){
			hour = "five";
		}else if(hours == 6){
			hour = "six";
		}else if(hours == 7){
			hour = "seven";
		}else if(hours == 8){
			hour = "eight";
		}else if(hours == 9){
			hour = "nine";
		}else if(hours == 10){
			hour = "ten";
		}else if(hours == 11){
			hour = "eleven";
		}else if(hours == 12){
			hour = "twelve";
		}
		if (minutes == 0){
			time = hour + "o'clock";
		}else if(minutes == 30){
			time = "half past " + hour;
		}else if(minutes == 15){
			time = "quarter past " + hour;
		}else if(minutes == 45 && hours != 12){
			hours++;
			if (hours == 1){
				hour = "one";
			}else if(hours ==2){
				hour = "two";
			}else if(hours == 3){
				hour = "three";
			}else if(hours == 4){
				hour = "four";
			}else if(hours == 5){
				hour = "five";
			}else if(hours == 6){
				hour = "six";
			}else if(hours == 7){
				hour = "seven";
			}else if(hours == 8){
				hour = "eight";
			}else if(hours == 9){
				hour = "nine";
			}else if(hours == 10){
				hour = "ten";
			}else if(hours == 11){
				hour = "eleven";
			}else if(hours == 12){
				hour = "twelve";
			}
			time = "quarter till " + hour;
		}else{
			time = minutes + " minutes past " + hour;
		}
		return time;
	}

}
