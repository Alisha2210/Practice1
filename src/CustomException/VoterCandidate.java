package CustomException;

public class VoterCandidate {
        public static void verifyCandidateVote(int age) throws CustomCheckedException{
            if(age >= 18){
                System.out.println("This candidate is eligible for the voting");
            }else{
                throw new CustomCheckedException("This candidate isn't eligible for the voting");
            }
        }

        public static void main(String[] args) throws CustomCheckedException {
            verifyCandidateVote(17);
        }
    }


