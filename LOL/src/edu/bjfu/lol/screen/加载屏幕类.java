package edu.bjfu.lol.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import edu.bjfu.lol.����;
import edu.bjfu.lol.scenes.scene2d.����Ӧ��̨��;
import edu.bjfu.lol.scenes.scene2d.ui.��������Ա��;
import edu.bjfu.lol.utils.������;

public class ������Ļ�� extends ��Ļ��
{
	private static final String ��ʾ������Ļ�����ַ��� = "�����Ļ����";
	private static final String ������ĻĿ¼ = ������.ͼƬĿ¼ + "LoadingScreen/";
	private boolean is���������Ƴ�;
	private ����Ӧ��̨�� ��̨;
	private Skin Ƥ����Դ;
	private ��������Ա�� ��������Ա;
	private ����Ļ�� ����Ļ;
	@Override
	public void render(float delta)
	{
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		��̨.act();
		��̨.draw();
		��������Ա.set����(����.ʵ��.get��ʼ������());
		if (��������Ա.is���())
		{
			if (!is���������Ƴ�)
			{
				����Ļ = new ����Ļ��();
				��������Ա.remove();
				/*TextBounds �����߷�Χ = λͼ����.getBounds(��ʾ������Ļ�����ַ���);
				*/
				Label ���������ǩ = new Label(��ʾ������Ļ�����ַ���, Ƥ����Դ);
				���������ǩ.setPosition((������.��Ļ�� - ���������ǩ.getWidth()) / 2, ������.��Ļ�� / 4);
				SequenceAction ˳���� = new SequenceAction();
				˳����.addAction(Actions.fadeIn(1));
				˳����.addAction(Actions.fadeOut(1));
				RepeatAction �ظ����� = Actions.forever(˳����);		
				���������ǩ.addAction(�ظ�����);
				��̨.addActor(���������ǩ);
				is���������Ƴ� = true;
			}
		}
		else
		{
			����.ʵ��.��ʼ����Ϸ��Դ();
		}
	}
	@Override
	public void show()
	{
		if (��̨ == null)
		{
			��̨ = new ����Ӧ��̨��()
			{
				@Override
				public boolean touchDown(int screenX, int screenY, int pointer, int button)
				{
					if (is���������Ƴ�)
					{
						����.ʵ��.������Ļ(����Ļ);
						����.ʵ��.���ű�������();
						dispose();
						return true;
					}
					else
					{
						return false;
					}
				}
			};
			// ��������ͼ��
			TextureAtlas ����ͼ�� = new TextureAtlas(Gdx.files.internal(������ĻĿ¼ + "Pack.txt"));
			// ����Ƥ����Դ
			Ƥ����Դ = new Skin(Gdx.files.internal(������ĻĿ¼ + "Skin.json"), ����ͼ��);
			// ���ñ���ͼƬ
			Image ����ͼƬ = new Image(Ƥ����Դ.getRegion("Background"));
			��̨.addActor(����ͼƬ);
			TextureRegion �� = Ƥ����Դ.getRegion("ProgressBar_Back");
			TextureRegion ǰ = Ƥ����Դ.getRegion("ProgressBar_Fore");
			��������Ա = new ��������Ա��(ǰ, ��, ������.��Ļ�� / 2, ��.getRegionHeight());
			��������Ա.setPosition(������.��Ļ�� / 4, ������.��Ļ�� / 10);
			��̨.addActor(��������Ա);
		}
		// �����û�����
		Gdx.input.setInputProcessor(��̨);
	}
	@Override
	public void dispose()
	{
		if (��̨ != null)
		{
			��̨.dispose();
		}
		if (Ƥ����Դ != null)
		{
			Ƥ����Դ.dispose();
		}
	}
}
