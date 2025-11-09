class CharOcc{
	public static void main(String... args){
		String str = "Prakashaaaaa";

		char ch = 'a';

		char[] charr = str.toCharArray();

		int count = 0;

		for(int i=0; i<charr.length; i++){
			if(charr[i] == ch){
				count++;
			}
		}
		System.out.println(count);
	}
}