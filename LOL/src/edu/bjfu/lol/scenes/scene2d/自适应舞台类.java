package edu.bjfu.lol.scenes.scene2d;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;

import edu.bjfu.lol.utils.������;

/**
 * ����Ӧ��Ļ�ֱ��ʵ�Stage
 */
public class ����Ӧ��̨�� extends Stage
{
	public ����Ӧ��̨��() {
		super(������.��Ļ��, ������.��Ļ��, true);
		// ��������ͷ
		setCamera(new OrthographicCamera(������.��Ļ��, ������.��Ļ��));
		getCamera().position.set(������.��Ļ��/2, ������.��Ļ��/2, 0);
	}
}
