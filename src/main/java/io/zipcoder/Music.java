package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int nextSongCount = 0;
        int lastSongCount = 0;

        for(int i = startIndex; i <= playList.length; i++){
            if(i == playList.length){
                i = 0;
            }
            nextSongCount++;
            if(playList[i] == selection){
                break;
            }
        }
        for(int j = startIndex; j > -1; j--){
            if(j == -1){
                j = playList.length - 1;
            }
            lastSongCount++;
            if(playList[j] == selection){
                break;
            }
        }

        if(nextSongCount < lastSongCount){
            return nextSongCount;
        } else if(lastSongCount < nextSongCount){
            return lastSongCount;
        }
        return null;
    }
}
