package edu.bjfu.lol;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import edu.bjfu.lol.utils.������;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "LOL";
		cfg.useGL20 = false;
		cfg.width = ������.��Ļ��;
		cfg.height = ������.��Ļ��;
		
		new LwjglApplication(new ����(), cfg);
	}
}
