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

class ������ע������ extends ������ {

	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 5;
	private static final int ���ܻ����˺� = 50;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 0.6f;
	private static final int ��Ĭ�����غ��� = 1;
	private static final String ������ = "������ע";
	private static final String �������� = String.format("%s  �Եз����Ŀ���ͷ����%d(+%.1f����ǿ��)��ħ���˺�,����\nĿ���Ĭ%d�غ�.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, ��Ĭ�����غ���);
	public ������ע������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
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
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.85f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "SorakaSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "SorakaSkillE.mp3"));
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
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		��ս��Ӣ���� ������Ӣ�� = �з�����.get���������Ӣ��(false);
		if (������Ӣ�� != null)
		{
			���������� �������� = new ����������();
			������Ӣ��.����Ĭ(��Ĭ�����غ���, ��������);
			if (������Ӣ��.is�ҷ�())
			{
				��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[������Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[������Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[������Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[������Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			int ����˺� = ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (�ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��() * ���ܸ����˺���ռ����ǿ�ȱ��� + ���ܻ����˺�), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸(), ��������);
			������װ����.ʵ��.�������(��������);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, false);
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
		return "D";
	}
}
