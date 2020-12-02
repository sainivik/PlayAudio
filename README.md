# PlayAudio
Play audio file
### Screenshot
<img src="https://github.com/sainivik/PlayAudio/blob/master/app/screenshots/audio_activity.png" width="360px" height="770px"/>

#### Usage



 set media file and create object of meadia player
 
```java
mediaPlayer = MediaPlayer.create(this, R.raw.sprinkle)
        mediaPlayer!!.setOnPreparedListener { }
        binding.ivPush.setOnTouchListener { _, event ->
            handleTouch(event)
            true
        }
```

 handle touch events
 
```java
  private fun handleTouch(event: MotionEvent) {

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                mediaPlayer.start()
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP -> {
                mediaPlayer.pause()
                mediaPlayer.seekTo(0)
            }
        }
    }
```

## Author

Vikas Saini

email: vikaskumarsaini0001@gmail.com

github: https://github.com/sainivik