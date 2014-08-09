package edu.bjfu.lol;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import edu.bjfu.lol.screen.������Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;

public class ���� extends Game
{
	private static final String UIĿ¼ = ������.ͼƬĿ¼ + "UI/";
	private static final String HeroĿ¼ = ������.ͼƬĿ¼ + "Hero/";
	// ����ʼ����ֻ��һ��ʵ��
	public static ���� ʵ��;
	// �����л���Ļ��ջ
	private Stack<Screen> ��Ļջ = new Stack<Screen>();
	private Music ��������;
	private AssetManager ��Դ������ = new AssetManager();
	private Skin UIƤ����Դ;
	private Map<String, Skin> Ӣ��Ƥ����Դӳ�� = new HashMap<String, Skin>();
	private boolean is��ʼ�����;
	private Sound ��ť����;
	@Override
	public void create()
	{
		// debug
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		ʵ�� = this;
		// ��������Ļ
		Music ��ӭ��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "Welcome.mp3"));
		��ӭ��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		��ӭ��Ч.play();
		// ��������
		�������� = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "Background.mp3"));
		// ����ѭ��
		��������.setLooping(true);
		// ����
		��������.setVolume(0.4f);
		// ��ť����
		��ť���� = Gdx.audio.newSound(Gdx.files.internal(������.����Ŀ¼ + "ButtonClick.mp3"));
		׼����ʼ����Ϸ��Դ();
		// ���������Ļ
		setScreen(new ������Ļ��());
	}
	public void ������Ļ(Screen ��Ļ)
	{
		��Ļջ.push(��Ļ);
		this.setScreen(��Ļ);
	}
	public void �˳���Ļ()
	{
		// �ͷ���Դ
		��Ļջ.pop().dispose();
		this.setScreen(��Ļջ.peek());
	}
	public void �ص�����Ļ()
	{
		this.setScreen(��Ļջ.firstElement());
		while (��Ļջ.size() > 1)
		{
			��Ļջ.pop().dispose();
		}
	}
	public void ���Ű�ť����()
	{
		��ť����.play();
	}
	public void ���ű�������()
	{
		if (!��������.isPlaying())
		{
			��������.play();
		}
	}
	public void ֹͣ���ű�������()
	{
		if (��������.isPlaying())
		{
			��������.stop();
		}
	}
	public float get��ʼ������()
	{
		float ��Դ���������� = ��Դ������.getProgress();
		if (��Դ���������� >= 1)
		{
			if (is��ʼ�����)
			{
				return 1;
			}
			else
			{
				new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						Ӣ��Ƥ����Դӳ��.put("Ahri", new Skin(��Դ������.get(HeroĿ¼ + "Ahri.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Ashe", new Skin(��Դ������.get(HeroĿ¼ + "Ashe.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Caitlyn", new Skin(��Դ������.get(HeroĿ¼ + "Caitlyn.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Garen", new Skin(��Դ������.get(HeroĿ¼ + "Garen.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Jinx", new Skin(��Դ������.get(HeroĿ¼ + "Jinx.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Kayle", new Skin(��Դ������.get(HeroĿ¼ + "Kayle.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("MasterYi", new Skin(��Դ������.get(HeroĿ¼ + "MasterYi.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Rammus", new Skin(��Դ������.get(HeroĿ¼ + "Rammus.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Riven", new Skin(��Դ������.get(HeroĿ¼ + "Riven.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Shen", new Skin(��Դ������.get(HeroĿ¼ + "Shen.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Soraka", new Skin(��Դ������.get(HeroĿ¼ + "Soraka.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Teemo", new Skin(��Դ������.get(HeroĿ¼ + "Teemo.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("TwistedFate", new Skin(��Դ������.get(HeroĿ¼ + "TwistedFate.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Veigar", new Skin(��Դ������.get(HeroĿ¼ + "Veigar.txt", TextureAtlas.class)));
						Ӣ��Ƥ����Դӳ��.put("Warwick", new Skin(��Դ������.get(HeroĿ¼ + "Warwick.txt", TextureAtlas.class)));
						is��ʼ����� = true;
					}
				}).start();
				return 0.99f;
			}
		}
		else
		{
			return ��Դ����������;
		}
	}
	private void ׼����ʼ����Ϸ��Դ()
	{
		��Դ������.load(UIĿ¼ + "Font.fnt", BitmapFont.class);
		��Դ������.load(HeroĿ¼ + "Ahri.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Ashe.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Caitlyn.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Garen.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Jinx.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Kayle.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "MasterYi.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Rammus.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Riven.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Shen.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Soraka.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Teemo.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "TwistedFate.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Veigar.txt", TextureAtlas.class);
		��Դ������.load(HeroĿ¼ + "Warwick.txt", TextureAtlas.class);
		��Դ������.load(UIĿ¼ + "Pack.txt", TextureAtlas.class);
	}
	public void ��ʼ����Ϸ��Դ()
	{
		��Դ������.update();
	}
	public Skin getUIƤ����Դ()
	{
		if (UIƤ����Դ == null)
		{
			UIƤ����Դ = new Skin(Gdx.files.internal(UIĿ¼ + "Skin.json"), ��Դ������.get(UIĿ¼ + "Pack.txt", TextureAtlas.class));
		}
		return UIƤ����Դ;
	}
	public Skin getӢ��Ƥ����Դ(String Ӣ��Ƥ���ļ���)
	{
		return Ӣ��Ƥ����Դӳ��.get(Ӣ��Ƥ���ļ���);
	}
}
