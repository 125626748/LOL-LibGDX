package edu.bjfu.lol.Ӣ��.����֮��;

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
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ��Ը������ extends ������ {
	private static final int ��һ���ͷŻغ��� = 3;
	private static final int �ͷż���غ��� = 15;
	private static final int ���ܻ����ظ�ֵ = 200;
	private static final float ���ܸ��ӻظ�����ֵ��ռ����ǿ�ȱ��� = 0.7f;
	private static final String ������ = "��Ը";
	private static final String �������� = String.format("%s  �������ٻ�ʥ�������,˲�����ظ��Լ��������ѷ�Ӣ��%d\n(+%.1f����ǿ��)����ֵ.",
			������
			,���ܻ����ظ�ֵ, ���ܸ��ӻظ�����ֵ��ռ����ǿ�ȱ���);
	public ��Ը������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		private boolean is����Ч;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���, boolean is����Ч)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			this.is����Ч = is����Ч;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������X, ������Y, Ӣ��Ƥ���ļ���, is����Ч);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(1f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���, boolean is����Ч)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "SorakaSkillW.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			if (is����Ч)
			{
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "SorakaSkillR.mp3"));
				��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
			}
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
			if (��Ч != null)
			{
				��Ч.play();
			}
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		int ��������ֵ = (int) (���ܻ����ظ�ֵ + ���ܸ��ӻظ�����ֵ��ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
		���������� �������� = new ����������();
		boolean is����Ч = true;
		for (��ս��Ӣ���� Ӣ�� : �ͷŴ˼��ܵ�Ӣ��.get��������().get��ս��Ӣ������())
		{
			if (Ӣ�� != null && !Ӣ��.is����())
			{
				if (Ӣ��.is�ҷ�())
				{
					��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), is����Ч));
				}
				else
				{
					��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), is����Ч));
				}
				is����Ч = false;
				Ӣ��.��������ֵ(��������ֵ, ��������);
			}
		}
		������װ����.ʵ��.�������(��������);
		return true;
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
