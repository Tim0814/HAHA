package test1;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		//oop(object-oriented programming)
				//oopl(object-oriented programming language)
				//C++����n��OOPL 
				//Java cross platform 

				//OOP ���S��: Encapsulation(�ʸ�)�AInheritance(�~��)�APolymorphism(�h��)
				//�`�ٶ}�o�ɶ��A���@����
				//class ���O�Aobject ����
				//class --- data type, object --- variable
				//���ظ�ƫ��A�Aint, float, double
				//�l�͸�ƫ��A�Aarray, structure, class
				//class contains data member(variable), member function(function, method)

				//three areas: public, private, protected, data member�򥻤W�|��bprivate
				//�u�������O����member function �~�i�H�����ϥ�
				//���i�H�����ϥ�
				//circle �p�⭱�n�A�b�|�AMath.PI(3.14159)

				int radius;
				double area;
				Scanner input = new Scanner(System.in);
				System.out.printf("Enter the radius: ");
				radius = input.nextInt();
					    
				area = radius * radius * Math.PI;
				System.out.printf("radius: %d, area: %.2f", radius, area);
	}
}
