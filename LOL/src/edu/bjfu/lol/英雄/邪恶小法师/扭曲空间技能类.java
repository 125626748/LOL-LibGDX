package edu.bjfu.lol.Ӣ��.а��С��ʦ;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class Ť���ռ似���� extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 10;
	private static final int ѣ�λغ��� = 1;
	private static final float ������ = 70f/ 100;
	private static final String ������ = "Ť���ռ�";
	private static final String �������� = String.format("%s  ά٤�ڵз����������һ��Ť���ռ�,�ڴ�����߽�ĵ���\n�ᱻѣ��%d�غ�,������%.0f%%.",
			������, 
			ѣ�λغ���, ������ * 100);
	public Ť���ռ似����()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private static class �ͷ������� extends ������
	{
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private static class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(1.2f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "VeigarSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "VeigarSkillE.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ӳ�.isAction�ѽ���())
			{
				����.remove();
				����.dispose();
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			��ս��Ļ��.ʵ��.�����Ա(����);
			��Ч.play();
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		float ������x = 0;
		float ������y = 0;
		int ���������� = 0;
		���������� �������� = new ����������();
		for (��ս��Ӣ���� ���� : �з�����.get���������С��ΧӢ������())
		{
			if (���� != null && !����.is����())
			{
				����������++;
				if (����.is�ҷ�())
				{
					������x += ��ս��Ļ��.�ҷ�X��������[����.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�ҷ�Y��������[����.getӢ������λ��()-1];
				}
				else
				{
					������x += ��ս��Ļ��.�з�X��������[����.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�з�Y��������[����.getӢ������λ��()-1];
				}
				if (������.����_����_�����Ƿ���(������))
				{
					����.��ѣ��(ѣ�λغ���, ��������);
				}
			}
		}
		������x /= ����������;
		������y /= ����������;
		��������.�������(new �ͷ�������(������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		������װ����.ʵ��.�������(��������);
		return true;
	}
	@Override
	public String get��������()
	{
		return ��������;
	}
	@Override
	public String get������()
	{
		return ������;
	}
	@Override
	public String get�����ļ���׺()
	{
		return "C";
	}
}
