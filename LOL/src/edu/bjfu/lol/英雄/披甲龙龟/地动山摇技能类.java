package edu.bjfu.lol.Ӣ��.��������;

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
import edu.bjfu.lol.��̬.��ս��Ӣ����.���������ͷ�״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class �ض�ɽҡ������ extends ������ {

	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 15;
	private static final int �����˺� = 65;
	private static final float �����˺���ռ����ǿ�ȱ��� = 0.3f;
	private static final float ������ = 70f / 100;
	private static final int �����غ��� = 4;
	private static final String ������ = "�ض�ɽҡ";
	private static final String �������� = String.format("%s  ��Ī˹�ͷŻ����𵴲�,ÿ�غ϶Ե���ÿ�����%d(+%.1f����\nǿ��)ħ���˺�,������%.0f%%������%d�غ�.", 
			������
			,�����˺�, �����˺���ռ����ǿ�ȱ���, ������ * 100, �����غ���);
	private static class �ض�ɽҡ���������ͷ�״̬�� extends ���������ͷ�״̬��
	{
		public �ض�ɽҡ���������ͷ�״̬��(int �������غ���) {
			super(�������غ���);
		}
		@Override
		public void �����ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
			super.�����ͷ�(�з�����, �ͷŴ˼��ܵ�Ӣ��);
			�����ͷ�(�з�����, �ͷŴ˼��ܵ�Ӣ��);
		}
		@Override
		public String get״̬����() {
			return "�ض�ɽҡ���������ͷ�";
		}
	}
	private static class �ͷ������� extends ������
	{
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		private boolean ����Ч;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���, boolean ����Ч)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			this.����Ч = ����Ч;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������x, ������y, Ӣ��Ƥ���ļ���, ����Ч);
		}
	}
	private static class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.5f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���, boolean ����Ч)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "RammusSkillR.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			if (����Ч)
			{
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "RammusSkillR.mp3"));
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
	private static void �����ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		int �����˺� = (int) (�����˺� + �����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
		int ����˺� = 0;
		boolean is���� = false;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
		���������� �������� = new ����������();
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), true));
		}
		else
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), true));
		}
		for (��ս��Ӣ���� �з�Ӣ�� : �з�����.get��ս��Ӣ������())
		{
			if (�з�Ӣ�� != null && !�з�Ӣ��.is����())
			{
				if (�з�Ӣ��.is�ҷ�())
				{
					��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�з�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�з�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), false));
				}
				else
				{
					��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�з�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�з�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), false));
				}
				if (������.����_����_�����Ƿ���(������))
				{
					����˺� += �з�Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
					is���� = true;
				}
			}
		}
		������װ����.ʵ��.�������(��������);
		if (is����)
		{
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, true);
		}
	}
	public �ض�ɽҡ������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		�����ͷ�(�з�����, �ͷŴ˼��ܵ�Ӣ��);
		�ͷŴ˼��ܵ�Ӣ��.��ӱ��������ͷ�״̬(new �ض�ɽҡ���������ͷ�״̬��(�����غ��� - 1));
		return true;
	}
	@Override
	public String get��������() {
		return ��������;
	}
	@Override
	public String get������() {
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