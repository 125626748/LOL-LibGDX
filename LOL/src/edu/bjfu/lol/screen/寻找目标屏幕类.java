package edu.bjfu.lol.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import edu.bjfu.lol.����;
import edu.bjfu.lol.������Ϣ��;
import edu.bjfu.lol.�����Ϣ��;
import edu.bjfu.lol.scenes.scene2d.����Ӧ��̨��;
import edu.bjfu.lol.utils.ͼ�������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.�߼�.ս���߼���;
import edu.bjfu.lol.��̬.Ӣ����;

public class Ѱ��Ŀ����Ļ�� extends ��Ļ��
{
	private static final String Ѱ��Ŀ����ĻĿ¼ = ������.ͼƬĿ¼ + "FindTargetScreen/";
	private static final String ͼƬ����ļ��� = Ѱ��Ŀ����ĻĿ¼ + "Pack.txt";
	private static final int Ӣ��ͼƬ���߶� = 170;
	private static final int Ӣ��ͼƬ����� = 150;
	private static final int[] X�������� = new int[]{212, 433, 133, 513, ������.��Ļ�� / 2};
	private static final int[] Y�������� = new int[]{530, 530, 440, 440, 370};
	private ����Ӧ��̨�� ��̨;
	private Ŀ����Ա�� Ŀ����Ա;
	private Skin Ƥ����Դ;
	private class Ŀ����Ա��
	{
		private Image[] Ӣ��ͼƬ���� = new Image[5];
		private Ŀ����Ա��()
		{
			����Ŀ��ͼƬ();
		}
		private void ����Ŀ��ͼƬ()
		{
			Ӣ����[] Ӣ������ = ������Ϣ��.get����().getӢ������();
			for (int i = 0; i < Ӣ��ͼƬ����.length; i++)
			{
				if (Ӣ������[i] != null)
				{
					final Image ͼƬ = new Image(Ӣ����.getӢ��ͼ��(Ӣ������[i].getӢ��Ƥ���ļ���()));
					ͼ�������.������Ա��������ָ������(ͼƬ, Ӣ��ͼƬ�����);
					ͼ�������.������Ա��������ָ������(ͼƬ, Ӣ��ͼƬ���߶�);
					ͼƬ.setPosition(X��������[i] - ͼƬ.getWidth() / 2, Y��������[i] - ͼƬ.getHeight() / 2);
					��̨.addActor(ͼƬ);
					Ӣ��ͼƬ����[i] = ͼƬ;
				}
			}
		}
		private void ��������Ŀ��()
		{
			for (int i = 0; i < Ӣ��ͼƬ����.length; i++)
			{
				if (Ӣ��ͼƬ����[i] != null)
				{
					Ӣ��ͼƬ����[i].remove();
				}
			}
			����Ŀ��ͼƬ();
		}
	}
	@Override
	public void render(float delta)
	{
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		��̨.act();
		��̨.draw();
	}
	@Override
	public void show()
	{
		if (��̨ == null)
		{
			��̨ = new ����Ӧ��̨��();
			// ��������ͼ��
			TextureAtlas ����ͼ�� = new TextureAtlas(Gdx.files.internal(ͼƬ����ļ���));
			// ����Ƥ����Դ
			Ƥ����Դ = new Skin(����ͼ��);
			// ����
			Image ����ͼƬ = new Image(Ƥ����Դ.getRegion("Background"));
			����ͼƬ.setSize(������.��Ļ��, ������.��Ļ��);
			��̨.addActor(����ͼƬ);
			// ���ذ�ť
			Button ���ذ�ť = new Button(����.ʵ��.getUIƤ����Դ().getDrawable("BackButtonUp"), ����.ʵ��.getUIƤ����Դ().getDrawable("BackButtonDown"));
			���ذ�ť.setPosition(21, 770);
			���ذ�ť.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					����.ʵ��.���Ű�ť����();
					����.ʵ��.�˳���Ļ();
				}
			});
			��̨.addActor(���ذ�ť);
			// �������ְ�ť
			Button �������ְ�ť = new Button(Ƥ����Դ.getDrawable("ChangeTargetButtonUp"), Ƥ����Դ.getDrawable("ChangeTargetButtonDown"));
			�������ְ�ť.setPosition((������.��Ļ�� / 2 - �������ְ�ť.getWidth()) / 2, 110);
			�������ְ�ť.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					������Ϣ��.���ɲ�һ�����������();
					Ŀ����Ա.��������Ŀ��();
					����.ʵ��.���Ű�ť����();
				}
			});
			��̨.addActor(�������ְ�ť);
			// ��ʼ��ս��ť
			Button ��ʼ��ս��ť = new Button(Ƥ����Դ.getDrawable("StartBattleButtonUp"), Ƥ����Դ.getDrawable("StartBattleButtonDown"));
			��ʼ��ս��ť.setPosition((������.��Ļ�� / 2 - ��ʼ��ս��ť.getWidth()) / 2 + ������.��Ļ�� / 2, 110);
			��ʼ��ս��ť.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					����.ʵ��.���Ű�ť����();
					����.ʵ��.������Ļ(new ��ս��Ļ��(new ս���߼���().��ս(�����Ϣ��.get����(), ������Ϣ��.get����())));
				}
			});
			��̨.addActor(��ʼ��ս��ť);
			// Ŀ����Ա
			Ŀ����Ա = new Ŀ����Ա��();
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
