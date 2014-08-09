package edu.bjfu.lol.screen;

import java.util.LinkedList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

import edu.bjfu.lol.����;
import edu.bjfu.lol.�����Ϣ��;
import edu.bjfu.lol.scenes.scene2d.����Ӧ��̨��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ѡ��Ӣ����Ļ�� extends ��Ļ��
{
	private static final String ѡ��Ӣ����ĻĿ¼ = ������.ͼƬĿ¼ + "SelectHeroScreen/";
	private static final String ͼƬ����ļ��� = ѡ��Ӣ����ĻĿ¼ + "Pack.txt";
	private ����Ӧ��̨�� ��̨;
	private Skin Ƥ����Դ;
	private Ӣ���б���Ա�� Ӣ���б���Ա;
	private int Ӣ���±�;
	private LabelStyle ���ֱ�ǩ��ʽ;
	private ս��׼����Ļ�� ս��׼����Ļ;
	private class Ӣ���б���Ա�� extends Group
	{
		private static final int ÿҳ��ʾ��Ա���� = 10;
		private static final int ���մ��ظ߶� = 500;
		private static final int ���մ�����ʼ���� = 250;
		private static final int ���Ҽ�� = 20;
		private int ��ǰҳ��;
		private int ��ҳ��;
		private VerticalGroup ��ֱ���� = new VerticalGroup();
		private ScrollPane �������;
		private Label ҳ����ǩ;
		private LinkedList<Actor> ��Ա�б� = new LinkedList<Actor>();
		private Ӣ���б���Ա��()
		{
			if (�����Ϣ��.get����().getӢ������()[Ӣ���±�] != null)
			{
				��Ա�б�.add(new Ӣ����Ϣ����Ա��(null));
			}
			for (Ӣ���� Ӣ�� : �����Ϣ��.getӢ���б�())
			{
				if (!�����Ϣ��.get����().is������Ӣ��(Ӣ��))
				{
					��Ա�б�.add(new Ӣ����Ϣ����Ա��(Ӣ��));
				}
			}
			��ҳ�� = (��Ա�б�.size() / ÿҳ��ʾ��Ա����) + (��Ա�б�.size() % ÿҳ��ʾ��Ա���� == 0 ? 0 : 1);
			��ǰҳ�� = 1;
			for (int i = (��ǰҳ�� - 1) * ÿҳ��ʾ��Ա����; i < ��ǰҳ�� * ÿҳ��ʾ��Ա���� && i < ��Ա�б�.size(); i++)
			{
				��ֱ����.addActor(��Ա�б�.get(i));
			}
			��ֱ����.setAlignment(Align.left);
			������� = new ScrollPane(��ֱ����);
			�������.setSize(������.��Ļ�� - ���Ҽ��, ���մ��ظ߶�);
			�������.setPosition(���Ҽ��, ���մ�����ʼ����);
			�������.setScrollingDisabled(true, false);
			ҳ����ǩ = new Label(String.format("%d/%d", ��ǰҳ��, ��ҳ��), new LabelStyle(����.ʵ��.getUIƤ����Դ().get(BitmapFont.class), new Color(255, 230, 0, 1f)));
			ҳ����ǩ.setFontScale(0.6f);
			ҳ����ǩ.setPosition(90, 208);
			addActor(ҳ����ǩ);
			addActor(�������);
		}
		private void ��һҳ()
		{
			��ǰҳ��--;
			if (��ǰҳ�� < 1)
			{
				if (��ҳ�� == 0)
				{
					��ǰҳ�� = 1;
				}
				else
				{
					��ǰҳ�� = ��ҳ��;
				}
			}
			������ʾҳ();
		}
		private void ��һҳ()
		{
			��ǰҳ��++;
			if (��ǰҳ�� > ��ҳ��)
			{
				��ǰҳ�� = 1;
			}
			������ʾҳ();
		}
		private void ������ʾҳ()
		{
			��ֱ����.clearChildren();
			�������.setScrollY(0);
			for (int i = (��ǰҳ�� - 1) * ÿҳ��ʾ��Ա����; i < ��ǰҳ�� * ÿҳ��ʾ��Ա���� && i < ��Ա�б�.size(); i++)
			{
				��ֱ����.addActor(��Ա�б�.get(i));
			}
			ҳ����ǩ.setText(String.format("%d/%d", ��ǰҳ��, ��ҳ��));
		}
	}
	private class Ӣ����Ϣ����Ա�� extends Group
	{
		private Image ����ͼƬ = new Image();
		private Drawable ��������;
		private Drawable ��������;
		public Ӣ����Ϣ����Ա��(final Ӣ���� Ӣ��)
		{
			�������� = Ƥ����Դ.getDrawable("HeroBarBackgroundUp");
			�������� = Ƥ����Դ.getDrawable("HeroBarBackgroundDown");
			����ͼƬ.setDrawable(��������);
			����ͼƬ.setSize(��������.getMinWidth(), ��������.getMinHeight());
			setSize(������.��Ļ�� - 2 * Ӣ���б���Ա��.���Ҽ��, ��������.getMinHeight());
			Image ͷ��ͼƬ = null;
			Label ���ֱ�ǩ = null;
			if (Ӣ�� == null)
			{
				���ֱ�ǩ = new Label("ж��Ů��", ���ֱ�ǩ��ʽ);
				ͷ��ͼƬ = new Image(Ƥ����Դ.getRegion("DeleteHero"));
			}
			else
			{
				ͷ��ͼƬ = new Image(Ӣ��.getӢ��ͷ��());
				���ֱ�ǩ = new Label(Ӣ��.getӢ������(), ���ֱ�ǩ��ʽ);
			}
			addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					�����Ϣ��.get����().getӢ������()[Ӣ���±�] = Ӣ��;
					ս��׼����Ļ.����������Ϣ(Ӣ���±�);
					�����Ϣ��.��������();
					����.ʵ��.�˳���Ļ();
				}
			});
			ͷ��ͼƬ.setPosition(Ӣ���б���Ա��.���Ҽ��, (getHeight() - ͷ��ͼƬ.getHeight()) / 2);
			���ֱ�ǩ.setPosition(ͷ��ͼƬ.getX() + ͷ��ͼƬ.getWidth() + Ӣ���б���Ա��.���Ҽ��, (getHeight() - ���ֱ�ǩ.getHeight()) / 2);
			addActor(����ͼƬ);
			addActor(ͷ��ͼƬ);
			addActor(���ֱ�ǩ);
			addListener(new InputListener()
			{
				private float ��һ�ΰ���λ��Y;
				boolean is�϶���;
				@Override
				public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
				{
					if (x >= 0 && x < ����ͼƬ.getWidth() && y >= 0 && y < ����ͼƬ.getHeight())
					{
						��һ�ΰ���λ��Y = y;
						is�϶��� = false;
						����ͼƬ.setDrawable(��������);
						return true;
					}
					else
					{
						return false;
					}
				}
				@Override
				public void touchUp(InputEvent event, float x, float y, int pointer, int button)
				{
					// ������ĳ��Ӣ��
					if (!is�϶���)
					{
						����.ʵ��.���Ű�ť����();
						����ͼƬ.setDrawable(��������);
					}
				}
				@Override
				public void touchDragged(InputEvent event, float x, float y, int pointer)
				{
					if (��һ�ΰ���λ��Y != y)
					{
						is�϶��� = true;
						����ͼƬ.setDrawable(��������);
					}
				}
			});
		}
	}
	public ѡ��Ӣ����Ļ��(int Ӣ���±�, ս��׼����Ļ�� ս��׼����Ļ)
	{
		this.Ӣ���±� = Ӣ���±�;
		this.ս��׼����Ļ = ս��׼����Ļ;
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
			���ֱ�ǩ��ʽ = new LabelStyle(����.ʵ��.getUIƤ����Դ().getFont("default"), new Color(103f / 255, 66f / 255, 11f / 255, 1));
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
					����.ʵ��.�˳���Ļ();
				}
			});
			��̨.addActor(���ذ�ť);
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
					����.ʵ��.�ص�����Ļ();
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
			Ӣ���б���Ա = new Ӣ���б���Ա��();
			��̨.addActor(Ӣ���б���Ա);
			// ��һҳ��ť
			Image ��һҳ��ť = new Image(Ƥ����Դ.getDrawable("LeftButton"));
			��һҳ��ť.setPosition(40, 500);
			��һҳ��ť.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					Ӣ���б���Ա.��һҳ();
				}
			});
			��̨.addActor(��һҳ��ť);
			// ��һҳ��ť
			Image ��һҳ��ť = new Image(Ƥ����Դ.getDrawable("RightButton"));
			��һҳ��ť.setPosition(������.��Ļ�� - 65, 500);
			��һҳ��ť.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					Ӣ���б���Ա.��һҳ();
				}
			});
			��̨.addActor(��һҳ��ť);
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
