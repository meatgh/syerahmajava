package com.company;

public class FlourPacker {

        public static boolean canPack(int bigCount, int smallCount, int goal){

            if(bigCount < 0 || smallCount < 0 || goal < 0)
                return false;

            if(smallCount == 0  ){
                if(bigCount*5 > goal)
                    return false;
                else{
                    int bigCountTotal = 0;
                    int count = 0;
                    while(bigCountTotal < goal && count < bigCount){
                        bigCountTotal += 5;
                        count++;
                    }
                }

            }

            boolean isPossible = false;
            int bigCountTotal = bigCount * 5;
            int smallCountTotal = smallCount *1;
            int bigCountUnit = bigCountTotal/bigCount;
            int smallCountUnit = smallCountTotal/smallCount;
            int sum = bigCountTotal + smallCountTotal;
            int makingItToGoal = 0;
            if(sum  > goal){
                if(smallCountTotal == 0 && bigCountTotal > goal){
                    isPossible = false;
                }

                if(bigCountTotal == 0 && smallCountTotal > goal){
                    while(makingItToGoal < goal){
                        makingItToGoal += smallCountUnit;
                    }
                }

                if(bigCountTotal - goal > 0){
                    makingItToGoal = bigCountUnit;
                    while(makingItToGoal < goal){
                        makingItToGoal += bigCountUnit;
                    }
                    while(makingItToGoal < goal){
                        makingItToGoal += smallCountUnit;
                    }

                    isPossible = true;
                }

                if(goal - bigCountTotal > 0){
                    makingItToGoal = bigCountTotal;
                    while(makingItToGoal < goal){
                        makingItToGoal = smallCountTotal/smallCount;
                    }
                    isPossible = true;
                }else{

                    isPossible = false;
                }


            }

            return isPossible;
        }

}
