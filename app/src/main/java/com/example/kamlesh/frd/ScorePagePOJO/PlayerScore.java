
package com.example.kamlesh.frd.ScorePagePOJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerScore {

    @SerializedName("message")
    @Expose
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}
