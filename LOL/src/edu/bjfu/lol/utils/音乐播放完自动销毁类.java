package edu.bjfu.lol.utils;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Music.OnCompletionListener;

public class ���ֲ������Զ������� implements OnCompletionListener
{
	@Override
	public void onCompletion(Music music)
	{
		// dispose֮ǰ������stop��������׳��쳣
		music.stop();
		music.dispose();
	}
}