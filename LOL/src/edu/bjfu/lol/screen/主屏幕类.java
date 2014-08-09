package edu.bjfu.lol.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import edu.bjfu.lol.����;
import edu.bjfu.lol.scenes.scene2d.����Ӧ��̨��;
import edu.bjfu.lol.scenes.scene2d.ui.��Բת����Ա��;
import edu.bjfu.lol.utils.������;

public class ����Ļ�� extends ��Ļ��
{
	private static final String ����ĻĿ¼ = ������.ͼƬĿ¼ + "MainScreen/";
	private static final String ͼƬ����ļ��� = ����ĻĿ¼ + "Pack.txt";
	private ����Ӧ��̨�� ��̨;
	private Skin Ƥ����Դ;
	private ��Բת����Ա�� ת����Ա;
	public ����Ļ��()
	{
		��̨ = new ����Ӧ��̨��();
		��̨.addListener(new InputListener()
		{
			private static final float ת�̽����¼������꿪ʼ = 200;
			private static final float ת�̽����¼���������� = 760;
			private float ��һ�ΰ��º�����;
			private boolean is�϶���;
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
			{
				if (y >= ת�̽����¼������꿪ʼ && y <= ת�̽����¼����������)
				{
					��һ�ΰ��º����� = x;
					ת����Ա.��֪ͨ�����Ѱ���();
					return true;
				}
				else
				{
					return false;
				}
			}
			@Override
			public void touchDragged(InputEvent event, float x, float y, int pointer)
			{
				if (Math.abs(x - ��һ�ΰ��º�����) >= 0.1f)
				{
					ת����Ա.��ת��Ļ����λ��((x - ��һ�ΰ��º�����) / ������.��Ļ�� * 2f);
					��һ�ΰ��º����� = x;
					is�϶��� = true;
				}
			}
			@Override
			public void touchUp(InputEvent event, float x, float y, int pointer, int button)
			{
				ת����Ա.��֪ͨ�������ɿ�();
				if (!is�϶��� && x >= ��Բת����Ա��.ת�����ĺ����� - ������.��Ļ�� / 3 && x <= ��Բת����Ա��.ת�����ĺ����� + ������.��Ļ�� / 3 && ת����Ա.is�ص�����())
				{
					����.ʵ��.���Ű�ť����();
					����.ʵ��.������Ļ(new ս��׼����Ļ��(ת����Ա, ����Ļ��.this));
				}
				is�϶��� = false;
			}
		});
		// ��������ͼ��
		TextureAtlas ����ͼ�� = new TextureAtlas(Gdx.files.internal(ͼƬ����ļ���));
		// ����Ƥ����Դ
		Ƥ����Դ = new Skin(����ͼ��);
		// ����
		Image ����ͼƬ = new Image(Ƥ����Դ.getRegion("Background"));
		����ͼƬ.setSize(������.��Ļ��, ������.��Ļ��);
		��̨.addActor(����ͼƬ);
		// �鿴Ӣ�۰�ť
		Button �鿴Ӣ�۰�ť = new Button(Ƥ����Դ.getDrawable("ViewHeroButtonUp"), Ƥ����Դ.getDrawable("ViewHeroButtonDown"));
		�鿴Ӣ�۰�ť.setPosition(21, 770);
		�鿴Ӣ�۰�ť.addListener(new ClickListener()
		{
			@Override
			public void clicked(InputEvent event, float x, float y)
			{
				����.ʵ��.���Ű�ť����();
				����.ʵ��.������Ļ(new �鿴Ӣ����Ļ��());
			}
		});
		��̨.addActor(�鿴Ӣ�۰�ť);
		// �ײ���ť����
		float ��ť�߶ȵ������� = ������.��Ļ�� * 1.0f / Gdx.graphics.getWidth();
		Image �ײ���ť����ͼƬ = new Image(����.ʵ��.getUIƤ����Դ().getRegion("UnderButtonsBackground"));
		�ײ���ť����ͼƬ.setSize(�ײ���ť����ͼƬ.getWidth(), �ײ���ť����ͼƬ.getHeight() * ��ť�߶ȵ�������);
		�ײ���ť����ͼƬ.setPosition(0, 80);
		��̨.addActor(�ײ���ť����ͼƬ);
		// ����Ļ��ť
		Button ����Ļ��ť = new Button(����.ʵ��.getUIƤ����Դ().getDrawable("MainScreenButtonUp"), ����.ʵ��.getUIƤ����Դ().getDrawable("MainScreenButtonDown"));
		����Ļ��ť.setPosition(16, 90);
		����Ļ��ť.setSize(����Ļ��ť.getWidth(), ����Ļ��ť.getHeight() * ��ť�߶ȵ�������);
		����Ļ��ť.addListener(new ClickListener()
		{
			@Override
			public void clicked(InputEvent event, float x, float y)
			{
				����.ʵ��.���Ű�ť����();
			}
		});
		��̨.addActor(����Ļ��ť);
		// ��ս��ť
		Button ��ս��ť = new Button(����.ʵ��.getUIƤ����Դ().getDrawable("BattleButtonUp"), ����.ʵ��.getUIƤ����Դ().getDrawable("BattleButtonDown"));
		��ս��ť.setPosition(117, 90);
		��ս��ť.setSize(��ս��ť.getWidth(), ��ս��ť.getHeight() * ��ť�߶ȵ�������);
		��ս��ť.addListener(new ClickListener()
		{
			@Override
			public void clicked(InputEvent event, float x, float y)
			{
				����.ʵ��.���Ű�ť����();
				����.ʵ��.������Ļ(new Ѱ��Ŀ����Ļ��());
			}
		});
		��̨.addActor(��ս��ť);
		// ת��
		ת����Ա = new ��Բת����Ա��();
		ת����Ա.setScale(280);
		��̨.addActor(ת����Ա);
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
		// �����û�����
		Gdx.input.setInputProcessor(��̨);
	}
	public void �ָ�ת��()
	{
		��̨.addActor(ת����Ա);
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
