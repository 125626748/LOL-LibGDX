package edu.bjfu.lol.Ӣ��.��������֮��;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.actions.����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class �����������弼���� extends ������ {
	
	private static final int ��һ���ͷŻغ��� = 3;
	private static final int �ͷż���غ��� = 10;
	private static final int ���ܻ����˺�ֵ = 175;
	private static final float Ŀ��ÿʧȥ����ֵ�� = 3.5f;
	private static final int �����˺�ֵ = 1;
	private static final String ������ = "������������";
	private static final String �������� = String.format("%s  �����ٻ���������֮��,��ͼնɱ�з���������Ӣ��,Ŀ��\n��ʧ������Խ��,��˼�����ɵ��˺�Խ��.���%dħ���˺�,����ÿʧȥ\n%.1f����ֵ�ͻ�����%d�˺�.",
			������
			, ���ܻ����˺�ֵ, Ŀ��ÿʧȥ����ֵ��, �����˺�ֵ);
	public �����������弼����() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.75f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "GarenSkillR.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			int λ�� = -200;
			����.setPosition(������X, ������Y - λ��);
			����ƶ�Action �ƶ�Action = new ����ƶ�Action(0, λ��, 0.2f);
			SequenceAction ˳��Action = Actions.sequence(�ƶ�Action, �ӳ�);
			����.addAction(˳��Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "GarenSkillR.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
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
		��ս��Ӣ���� ������Ӣ�� = �з�����.get��������Ӣ��(false);
		if (������Ӣ�� != null)
		{
			if (������Ӣ��.is�ҷ�())
			{
				������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[������Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[������Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[������Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[������Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			int �����˺� = (int) ((������Ӣ��.get��ս���������ֵ() - ������Ӣ��.get��ս������ֵ()) / Ŀ��ÿʧȥ����ֵ�� * �����˺�ֵ);
			int ���ħ���˺� = ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, ���ܻ����˺�ֵ + �����˺�, �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸(), null);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(���ħ���˺�, false);
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String get��������() {
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
		return "E";
	}
	@Override
	public boolean is����()
	{
		return true;
	}
}
