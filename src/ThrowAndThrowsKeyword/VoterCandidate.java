package ThrowAndThrowsKeyword;

public class VoterCandidate {
    public static void verifyCandidateVote(int age) throws Exception{
        if(age >= 18){
            System.out.println("This candidate is eligible for the voting");
        }else{
            throw new Exception("This candidate isn't eligible for the voting");
        }
    }

    public static void main(String[] args) throws Exception {
        verifyCandidateVote(17);
    }
}
