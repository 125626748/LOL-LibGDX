package edu.bjfu.lol.Ӣ��.Ѹ�ݳ��;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ������������� extends ������
{
	private static final int ���������˺� = 10;
	private static final float ���������˺���ռ����ǿ�ȱ��� = 0.3f;
	private static final int �������˺� = 6;
	private static final float ��󸽼��˺���ռ����ǿ�ȱ��� = 0.1f;
	private static final int ����˺������غ��� = 1;
	private static final String ������ = "�������";
	private static final String �������� = String.format("%s  ��Ī����ͨ������ʹĿ���ж�,�������%d(+%.1f����ǿ��)\nħ���˺�,��������%d�غ���ÿ�غ����%d(+%.1f����ǿ��)ħ���˺�.", 
			������, ���������˺�, ���������˺���ռ����ǿ�ȱ���, ����˺������غ���, �������˺�, ��󸽼��˺���ռ����ǿ�ȱ���);
	private static class �������״̬�� extends ��ͨ��������Ч��״̬��
	{
		private static class �ж�״̬�� extends ״̬��
		{
			private int ��ֵ��͸;
			private float �ٷֱȴ�͸;
			private int �˺�ֵ;
			private ��ս��Ӣ���� ������;
			public �ж�״̬��(��ս��Ӣ���� ������, int �˺�ֵ, int ��ֵ��͸, float �ٷֱȴ�͸) {
				super(����˺������غ��� + 1);
				this.�˺�ֵ = �˺�ֵ;
				this.��ֵ��͸ = ��ֵ��͸;
				this.�ٷֱȴ�͸ = �ٷֱȴ�͸;
				this.������ = ������;
			}
			@Override
			public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
				���������� �������� = new ����������();
				��������.�������(new ״̬�ı���ʾ������(��״̬����Ӣ��.is�ҷ�(), ��״̬����Ӣ��.getӢ������λ��(), "�ж�", false));
				��״̬����Ӣ��.�����ħ���˺�(������, �˺�ֵ, ��ֵ��͸, �ٷֱȴ�͸, ��������);
				������װ����.ʵ��.�������(��������);
			}
			@Override
			public String get״̬����() {
				return "����������ж�ÿ�غ����ħ���˺�";
			}
		}
		public �������״̬��() {
			super(Integer.MAX_VALUE);
		}
		private static class �ͷ������� extends ������
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
		private static class �ͷŶ����� extends ������
		{
			private �ӳ�Action �ӳ� = new �ӳ�Action(0.8f);
			private ������Ա�� ����;
			private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
			{
				ParticleEffect ����Ч�� = new ParticleEffect();
				����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "TeemoSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
				���� = new ������Ա��(����Ч��);
				����.setPosition(������X, ������Y);
				����.addAction(�ӳ�);
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
			}
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������) {
			int ����ǿ�� = ������.get��ս�з���ǿ��();
			int ��ֵ��͸ = ������.get��ս����ֵ������͸();
			float �ٷֱȴ�͸ = ������.get��ս�аٷֱȷ�����͸();
			״̬�� �ж�״̬ = ��������.get����ֵ����״̬(�ж�״̬��.class);
			if (�ж�״̬ == null)
			{
				��������.�������ֵ����״̬(new �ж�״̬��(������, (int) (�������˺� + ��󸽼��˺���ռ����ǿ�ȱ��� * ����ǿ��), ��ֵ��͸, �ٷֱȴ�͸));
			}
			else
			{
				�ж�״̬.����״̬�غ���();
			}
			���������� �������� = new ����������();
			if (��������.is�ҷ�())
			{
				��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[��������.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[��������.getӢ������λ��()-1], ������.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[��������.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[��������.getӢ������λ��()-1], ������.getӢ��().getӢ��Ƥ���ļ���()));
			}
			��������.�����ħ���˺�(������, (int) (���������˺� + ���������˺���ռ����ǿ�ȱ��� * ����ǿ��), ��ֵ��͸, �ٷֱȴ�͸, ��������);
			������װ����.ʵ��.�������(��������);
		}
		@Override
		public String get״̬����() {
			return ��������;
		}
	}
	public �������������()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new �������״̬��());
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
		return "D";
	}
}
