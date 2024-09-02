package ch05.sec07;

public class MultidimennsionalArrayByNewExample {
    public static void main(String[] args) {
        //각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생선
        int[][] mathScores = new int[2][3];
        //배열 항목 초기화 출력
        for (int i = 0; i < mathScores.length; i++) {    // 반의 수만큼 반복
            for (int k = 0; k < mathScores.length; k++) {    //해당 반의 학생 수만큼 반복
                System.out.println("mathScores[" + i + "][" + k + "]:" + mathScores[i][k]);

            }
        }
        System.out.println();
        //배열 항목 값 변경
        double a = (Math.random() * 100) + 1;
        int totalStudent = 0;
        int totalMathSum = 0;

        for (int q = 0; q < mathScores.length; q++) {
            for (int w = 0; w < mathScores[q].length; w++) {
                mathScores[q][w] = (int) a;

                totalStudent += mathScores[q].length;

                for (int e = 0; e < mathScores[q].length; e++) {
                    totalMathSum += mathScores[q][w];
                }
            }

            double totalMathAvg = (double) totalMathSum / totalStudent;
            System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
            System.out.println();

            //각 반의 학생수가 다를 경우 점수 저장을 위한 2차원 배열 생성
            int[][] englishScores = new int[2][];
            englishScores[0] = new int[2];
            englishScores[1] = new int[3];
            //배열 항목 초기값 출력
            for (int i = 0; i < englishScores.length; i++) {
                for (int k = 0; k < englishScores[i].length; k++) {
                    System.out.println("englishScores[" + i + "][" + k + "]:" + englishScores[i][k]);
                }
            }
            System.out.println();
            englishScores[0][0] = 90;
            englishScores[0][1] = 91;
            englishScores[1][0] = 92;
            englishScores[1][1] = 93;
            englishScores[1][2] = 94;
            //전체 학생의 영어 평균 구하기

            totalStudent = 0;
            int totalEnglishSum = 0;

            for (int i = 0; i < englishScores.length; i++) {
                totalStudent += englishScores[i].length;
                for (int k = 0; k < englishScores[i].length; k++) {
                    totalEnglishSum += englishScores[i][k];
                }
            }
            double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
            System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
        }
    }
}
