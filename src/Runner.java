import java.util.ArrayList;
public class Runner {
public static ArrayList<Profile> profiles = new ArrayList<Profile>();
	public static void main(String[] args) {
		

	}
	public static boolean login(String userName, String password) {
		Profile yourProfile;
		for(int i = 0; i < profiles.size(); i++){
			if(profiles.get(i).getUserName().equals(userName)){
				yourProfile = profiles.get(i);
			}
		}
		if(password.equals(yourProfile.getPassword())){
			return true;
		}
		else{
			return false;
		}
	}

}
